import React from 'react';
import { Link } from "react-router-dom";
import Topo from '../topo/Topo';
import App  from "../App"
//import Rodape from './Rodape';
import './CadConDes.css'
const Destino = () => {
    return(
        <div>
                <Topo></Topo>
                
                <div id="contato">
        <form class="card">
            <h2>PASSAGENS</h2>
            
            <div class="card-content-area">
                <label for="cpfCli">Digite seu CPF?</label>
                
                <input type="text" id="cpfCli" name="cpfCli"></input>
                
            </div>
            <div class="card-content-area">
                <label for="localSaidaDestino">De onde você está saindo?</label>
                
                <input type="text" id="localSaidaDestino" name="localSaidaDestino"></input>
                
            </div>
            
            <div class="card-content-area">
                
                <label for="localDestino">Para onde você vai?</label>
                
                <input type="text" id="localDestino" name="localDestino"></input>
               
                </div>
                <div class="card-content-area">
                
                <label for="horaDestino">Hora?</label>
                
                <input type="text" id="horaDestino" name="horaDestino"></input>
               
                </div>
                <div class="card-content-area">
                
                <label for="dataDestino">Escolha a data?</label>
                
                <input type="date" id="dataDestino" name="dataDestino"></input>
               
                </div>
            
           <div>
            
            <a href="#"><input class="botao" type="submit" value="Buscar"></input> </a>        
        
 
           </div> 
        </form>
    </div>





                
            
        </div>
    )
}

export default Destino;