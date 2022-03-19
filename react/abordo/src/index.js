import React from 'react';
import ReactDOM from 'react-dom';
//import App from './App';
import { BrowserRouter, Routes, Route } from "react-router-dom"
//import React, {useEffect, useState } from 'react';



import App from './App';


import Sobre from "./components/Sobre"
import Contato from "./paginas/forms/Contato"
import Destino from "./paginas/forms/Destino"
import Cadastro from "./paginas/forms/Cadastro"
import Promocoes from "./paginas/Promocoes/Promocoes"
import Index from './paginas/home/index'
import Login from "./paginas/forms/Login"

//ReactDOM e parametro = render
ReactDOM.render(
  <BrowserRouter>
     <Routes>
        {/* <Route element = { <App /> } path="/" /> */}
        <Route element = { <Sobre/>} path="/sobre"/>
        <Route element = { <Contato/> } path="/contato"/>
        <Route element = { <Destino/> } path="/destino"/>
        <Route element = { <Cadastro/> } path="/cadastro"/>
        <Route element = { <Promocoes/> } path="/promocoes" />
        <Route element = { <Index/> } path="/" exact/>
        <Route element={ <Login/> } path="/login"/>
        

      </Routes>
  </BrowserRouter>,
  document.getElementById('root')
);


// component(element) nova sintaxe que faz o caminho da rotas
// e chama os parametros = ex sobre ...
// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
//reportWebVitals();
