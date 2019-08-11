import React, { useState, useEffect } from 'react';
import AsyncStorage from '@react-native-community/async-storage'
import {
    KeyboardAvoidingView,
    Platform,
    StyleSheet,
    Image,
    Text,
    TextInput,
    TouchableOpacity,
} from 'react-native';


import logo from '../assets/logo.png'
import axios from 'axios'

export default function Login({ navigation }) {
    const [user, setUser] = useState('');

    useEffect(() => {
        AsyncStorage.getItem('user').then(user => {
            if (user){
                navigation.navigate('Main', {user})
            }
        })
    }, [])

    async function handleLogin() {
        try {
            // const response = await axios.get(`https://api.github.com/users/${user}`);
            const response = await axios.post('http://localhost:3333/devs', {
                username: user,
            })
            // console.log(response.data)
            const { _id } = response.data;

            await AsyncStorage.setItem('user', _id)

            navigation.navigate('Main', { user: _id });
        } catch (error) { console.log(error) }
    }

    return (
        <KeyboardAvoidingView
            behavior="padding"
            enabled={Platform.OS === 'ios'}
            style={styles.container}
        >
            <Image source={logo} />
            <TextInput
                autoCapitalize="none"
                autoCorrect={false}
                placeholder="Digite seu usuário do Github"
                placeholderTextColor="#999"
                style={styles.input}
                value={user}
                onChangeText={setUser}
            />
            <TouchableOpacity onPress={handleLogin} style={styles.button}>
                <Text style={styles.buttonText}>Enviar</Text>
            </TouchableOpacity>
        </KeyboardAvoidingView>
    );
}
const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#f5f5f5',
        justifyContent: 'center',
        alignItems: 'center',
        padding: 30,
    },

    input: {
        height: 46,
        alignSelf: 'stretch',
        backgroundColor: '#fff',
        borderWidth: 1,
        borderColor: '#ddd',
        borderRadius: 4,
        marginTop: 20,
        paddingHorizontal: 15,
    },

    button: {
        height: 46,
        alignSelf: 'stretch',
        backgroundColor: '#df4723',
        borderRadius: 4,
        marginTop: 10,
        justifyContent: 'center',
        alignItems: 'center',
    },

    buttonText: {
        color: '#fff',
        fontWeight: 'bold',
        fontSize: 16,
    },
});