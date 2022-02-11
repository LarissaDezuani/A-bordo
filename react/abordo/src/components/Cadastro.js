import React from 'react';
import { Link } from "react-router-dom";
//import App  from "../App"
//import Rodape from './Rodape';
import './CadConDes.css'
import Topo from '../topo/Topo';
import Rodape from '../rodape/Rodape'
import App from '../App'
const Cadastro = () => {
    return(
        <div>
            
                <App></App>
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





               
            <Rodape></Rodape>
        </div>
    )
}

export default Cadastro;