import React from 'react';
import { Link } from "react-router-dom";
//import App  from "../App"

import './CadConDes.css'
import Rodape from '../../rodape/Rodape'
import App from '../../App'
const Login = () => {
    return(
        <div>
            <App></App>
                
                <div id="contato">
        <form class="card">

            <h2>LOGIN</h2>

            <div class="card-content-area">
                <label for="nome">Nome:</label>
                
                <input type="text" id="nome" name="nome"></input>
                
            </div>
            <div class="card-content-area">
                
            <label for="senha">Senha:</label>
            
            <input type="password" id="senha" name="senha"></input>
            
            

            </div>
            
           
           <div>
            
            <a href="#"><input class="botao" type="submit" value="Entrar"></input> </a>        

           </div> 
           <div className="log">
                <a href='#'><p>Esqueci minha senha</p></a> 
                <a ><Link to="/cadastro"><p>Cadastrar</p></Link></a>
            </div>
        </form>
    </div>





               
         <Rodape></Rodape>   
        </div>
    )
}

export default Login;