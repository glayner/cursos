import React, { useState, useEffect } from 'react'
import './styles.css'
import {useParams} from 'react-router-dom'
import api from '../../services/api'

export default function Product() {
    const [product, setProduct] = useState([])
    const {id} = useParams()
    useEffect(() => {
        async function loadProduct() {
            const response = await api.get(`/products/${id}`)
          setProduct(response.data)
        }
        loadProduct();
     })
    return (
        <>
            <div className="product-info">
                <h1>{product.title}</h1>
                <p>{product.description}</p>
                <p>
                    URL: <a href={product.url}>{product.url}</a>
                </p>
            </div>
        </>
    )
}