import React from 'react';
import { Link } from "react-router-dom";
//import App  from "../App"
import Topo from '../topo/Topo'
import './CadConDes.css'

const Contato = () => {
    return(
        <div>
                <Topo></Topo>
                
                <div id="contato">
        <form class="card">

            <h2>Entre em contato</h2>

            <div class="card-content-area">
                <label for="nome">Nome:</label>
                
                <input type="text" id="nome" name="nome"></input>
                
            </div>
            <div class="card-content-area">
                
            <label for="email">E-mail:</label>
            
            <input type="email" id="email" name="email"></input>
           
            </div>
            
            <div class="card-content-area">
                <label for="msg">Mensagem:</label>
            <textarea id="msg" name="msg" rows="3" cols="60" maxlength="10" placeholder="Insira aqui a mensagem"></textarea>
            
            </div>
           <div>
            
            <a href="#"><input class="botao" type="submit" value="Enviar"></input> </a>        
        
 
           </div> 
        </form>
    </div>





               
            
        </div>
    )
}

export default Contato;