import './Topo.css'
import React from 'react';
import { Link } from "react-router-dom";
import user from '../topo/user_(1).png'

function Topo (){
    return(
<header>
        <h1 class="float-l">
          <a  title="Titulo do Site">A bordo</a>
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
              <a ><Link to="/destino"><h5>Destino</h5></Link></a>
            </li>
            <li>
              <a ><Link to="/promocoes"><h5>Promoções</h5></Link></a>
            </li>
            <li class="list-user">
            <a ><Link to="/cadastro"><img class="user" src={user} alt="user"></img></Link></a>

            </li>
          </ul>
        </nav>
      </header>
    );
}
export default Topo;