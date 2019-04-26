import './Nav.css'
import NavIten from './NavIten'
import React from 'react'


export default props => 
    <aside className="menu-area">
        <nav className="menu">
        <NavIten link="/" icon="home" title="Início"/>
        <NavIten link="/users" icon="users" title=" Usuários"/>
        </nav>
    </aside>