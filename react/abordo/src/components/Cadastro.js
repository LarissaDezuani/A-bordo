import React from 'react';
import { Link } from "react-router-dom";
//import App  from "../App"
//import Rodape from './Rodape';
import './CadConDes.css'
import Topo from '../topo/Topo';
const Cadastro = () => {
    return(
        <div>
            
                
                <Topo></Topo>
                <div id="contato">
        <form class="card">

        <h2>Cadastro</h2>

<div className="card-content-area">
    <label for="nome">Nome:</label>
    
    <input type="text" id="nome" name="nome"></input>
    
</div>
<div className="card-content-area">
    
<label for="cpf">CPF:</label>

<input type="text" id="cpf" name="cpf"></input>

</div>
<div className="card-content-area">
    
<label for="nascimento">Nascimento:</label>

<input type="date" id="nascimento" name="nascimento"></input>

</div>
           <div>
            
            <a href="#"><input class="botao" type="submit" value="Enviar"></input> </a>        
        
 
           </div> 
        </form>
    </div>





               
            
        </div>
    )
}

export default Cadastro;