import './Topo.css'
import React from 'react';
import { Link } from "react-router-dom";


function Topo (){
    return(
<header>
        <h1 class="float-l">
          <a  title="Titulo do Site">Abordo</a>
        </h1>
        
        <input type="checkbox" id="control-nav" />
        <label for="control-nav" class="control-nav"></label>
        <label for="control-nav" class="control-nav-close"></label>
  
        <nav class="float-r">
          <ul class="list-auto">
            <li>
              <a  ><Link to="/index"><h5>Home</h5></Link></a>
            </li>
            <li>
                
              <a ><Link to="/contato"><h5>Contato</h5></Link></a>
            </li>
            <li>
              <a ><Link to="/cadastro"><h5>Cadastro</h5></Link></a>
            </li>
            <li>
              <a ><Link to="/destino"><h5>Destino</h5></Link></a>
            </li>
            <li>
              <a ><Link to="/sobre"><h5>Sobre</h5></Link></a>
            </li>
            <li>
              <a ><Link to="/promocoes"><h5>Promoções</h5></Link></a>
            </li>
          </ul>
        </nav>
      </header>
    );
}
export default Topo;