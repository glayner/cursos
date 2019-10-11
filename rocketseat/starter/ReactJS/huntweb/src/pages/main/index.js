import React, { useState, useEffect } from 'react'
import {Link} from 'react-router-dom'
import api from '../../services/api'
import './styles.css'
export default function Main() {
    const [products, SetProducts] = useState([])
    const [info, SetInfo] = useState([])
    async function loadProducts(pagination = 1) {
        const response = await api.get(`/products?page=${pagination}`)
        const { docs, ...productInfo } = response.data
        SetProducts(response.data.docs)
        SetInfo(productInfo)
    }
    useEffect(() => {
        loadProducts();
    }, [])
    function prevPage() {
        const page = parseInt(info.page)

        if (page === 1) return;

        const pagerNumer = page - 1
        loadProducts(pagerNumer); 
     }
    function nextPage() {
        const page = parseInt(info.page)

        if (page === info.pages) return;

        const pagerNumer = page + 1
        loadProducts(pagerNumer);
    }
    return (
        <>
            <div className="product-list">
                {products.map(product => (
                    <article key={product._id}>
                        <strong>{product.title}</strong>
                        <p>{product.description}</p>

                        <Link to={`/products/${product._id}`}>Acessar</Link>
                    </article>
                ))}
                <div className="actions">
                    <button disabled={parseInt(info.page) === 1} onClick={prevPage}>Anterior</button>
                    <button disabled={parseInt(info.page) === info.pages} onClick={nextPage}>Próximo</button>
                </div>
            </div>
        </>
    )
}