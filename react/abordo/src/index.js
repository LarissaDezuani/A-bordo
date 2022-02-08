import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import { BrowserRouter, Routes, Route } from "react-router-dom"

import Sobre from "./components/Sobre"
import Contato from "./components/Contato"
import Destino from "./components/Destino"
import Cadastro from "./components/Cadastro"
import Promocoes from "./components/Promocoes"

//ReactDOM e parametro = render
ReactDOM.render(
  <BrowserRouter>
     <Routes>
        <Route element = { <App /> } path="/" exact/>
        <Route element = { <Sobre/>} path="/sobre"/>
        <Route element = { <Contato/> } path="/contato"/>
        <Route element = { <Destino/> } path="/destino"/>
        <Route element = { <Cadastro/> } path="/cadastro"/>
        <Route element = { <Promocoes/> } path="/promocoes" />
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
