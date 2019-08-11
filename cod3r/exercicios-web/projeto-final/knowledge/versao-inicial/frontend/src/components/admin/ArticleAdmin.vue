<template>
    <div class="article-admin">
        <b-form>
            <input type="hidden" v-model="article.id" id="article-id">

            <b-form-group label='Nome:' label-for='article-nome'>
                <b-form-input type='text' id="article-nome" required v-model="article.name" :readonly="mode ==='remove'" placeholder="Informe o Nome do Artigo..."/>
            </b-form-group>

            <b-form-group label='Descrição:' label-for="article-destription">
                <b-form-input type='text' id="article-description" v-model="article.description" required :readonly="mode === 'remove'" placeholder="Informe a Descrição do Artigo..."/>
            </b-form-group>

            <b-form-group label='Imagem(URL):' label-for='article-imageUrl' v-if="mode === 'save'">
                <b-form-input type='text' required id="article-imageUrl" v-model="article.imageUrl" placeholder='Informe a URL da Imagem...' />
            </b-form-group>

            <b-form-group label='Categoria:' label-for='article-categories' v-if="mode ==='save'">
                <b-form-select id="article-categories" v-model="article.categoryId" :options='categories'/>
            </b-form-group>

            <b-form-group label='Autor:' label-for='article-users' v-if="mode === 'save'">
                <b-form-select id="article-users" v-model="article.userId" :options="users"/>
            </b-form-group>

            <b-form-group label='Conteúdo:' label-for='article-content' v-if="mode === 'save'">
                <VueEditor id="article-content" v-model="article.content"/>
            </b-form-group>

            <b-button variant='primary' v-show="mode === 'save'" @click="save">Salvar</b-button>
            <b-button variant='danger' v-show="mode === 'remove'" @click='remove'>Excluir</b-button>
            <b-button class="ml-2" @click="reset">Cancelar</b-button>
        </b-form>
        <hr>
        <b-table hover striped :items="articles" :fields="fields">
            <template slot="actions" slot-scope="data">
                <b-button variant='warning' @click="loadArticle(data.item)"><i class="fa fa-pencil"></i></b-button>
                <b-button variant='danger' @click="loadArticle(data.item, 'remove')" class="ml-2"><i class="fa fa-trash"></i></b-button>
            </template>
        </b-table>
        <b-pagination size='md' v-model="page" :total-rows='count' :per-page='limit'/>
    </div>
</template>

<script>
import axios from 'axios'
import {baseApiUrl, showError} from '@/global'
import {VueEditor} from 'vue2-editor'

export default {
    name: 'ArticleAdmin',
    components:{VueEditor},
    data: function(){
        return{
            mode: 'save',
            article:{},
            articles:[],
            categories:[],
            users:[],
            page: 1,
            limit:0,
            count:0,
            fields:[
                {key:'id', label:'Código', sortable: true},
                {key: 'name', label:'Nome', sortable:true},
                {key:'description', label:'Descrição', sortable: true},
                {key: 'actions', label:'Ações', sortable: true}
            ]
        }
    },
    methods:{
        loadArticles() {
            const url = `${baseApiUrl}/articles?page=${this.page}`
            axios.get(url).then(res => {
                this.articles = res.data.data
                this.count = res.data.count
                this.limit = res.data.limit
            })
        },
        reset(){
            this.mode = 'save'
            this.article = {}
            this.loadArticles()
        },
        save(){
            const method = this.article.id ? 'put' : 'post'
            const id = this.article.id ? `/${this.article.id}` : ''
            axios[method](`${baseApiUrl}/articles${id}`, this.article)
                .then(() =>{
                    this.$toasted.global.defaultSuccess()
                    this.reset()
                })
                .catch(showError)
        },
        remove(){
            const id = this.article.id 
            axios.delete(`${baseApiUrl}/articles/${id}`)
                .then(()=>{
                    this.$toasted.global.defaultSuccess()
                    this.reset()
                })
                .catch(showError)

        },
        loadArticle(article,mode='save'){
            this.mode = mode
            axios.get(`${baseApiUrl}/articles/${article.id}`)
                .then(res=> this.article = res.data)
        },
        loadCategories(){
            axios.get(`${baseApiUrl}/categories`)
                .then(res => {
                    this.categories = res.data.map(category =>{
                        return{value:category.id, text: category.path}
                    })
                })
        },
        loadUsers(){
            axios.get(`${baseApiUrl}/users`)
                .then(res=>{
                    this.users = res.data.map(user =>{
                        return{value:user.id, text:`${user.name} - ${user.email}`}
                    })
                })
        }
    },
    watch:{
        page(){
            this.loadArticles()
        }
    },
    mounted(){
        this.loadUsers()
        this.loadCategories()
        this.loadArticles()
    }
}
</script>

<style>

</style>
