
//import './App.css';
import React from 'react';
import { Link } from "react-router-dom";

function App() {
  return (
    <>
         <header>
      
      <ul id="ullist">
        <li className="inline"> 
        <Link to="/sobre"><h5>Sobre</h5></Link>
        </li>
        <li className="inline">
        <Link to="/contato"><h5>Contato</h5></Link>
        </li>
        <li className="inline">
        <Link to="/"><h5>Home</h5></Link>
        </li>
        <li className="inline">
        <Link to="/destino"><h5>Destino</h5></Link>
        </li>
        <li className="inline">
        <Link to="/cadastro"><h5>Cadastro</h5></Link>
        </li>
      </ul>
      
      
     <h1>aqui e a pagina <strong>home</strong></h1>
     
    </header>
    </>    
  );
}
export default App;
