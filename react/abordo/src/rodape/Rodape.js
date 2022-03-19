import './Rodape.css'
import React from 'react';
import insta from '../rodape/instaroxo.png'
import face from './faceroxo.png'
import { Link } from "react-router-dom";


function Rodape(){
    return(
        <div>
            <footer class="rodape">
        <div class="grupo-1">
            <div class="box">
                <figure>
                    <a href="#">
                        <h2>Abordo</h2>
                        <h2>Endereço</h2>
                        <p>Rua Ferreira BF, Mezanino 101 Bossa Nova Mall, Centro, SP, CEP.: 00000-000</p>
                        <h2>Contato</h2>
                        <p>contato@abordo.com.br</p>
                    </a>
                </figure>
            </div>
            <div class="box">
                
                
                <p>A agência A bordo promove segurança nas atividades de turismo por meio da conscientização e disponibilização de conhecimentos técnicos</p>
                <a ><Link to="/sobre"><h2>Saiba mais sobre nossa história</h2></Link></a>
            </div>
            <div class="box">
                <h2>Siga-nos</h2>
                
                    <div class="box-icons">
                        <a href="#"><img class="icon-insta" src={insta} alt="Instagram"></img></a>
                        <a href="#"><img class="icon-face" src={face} alt="Facebook"></img></a>
                    </div>

            </div>
        </div>
        <div class="grupo-2">
            <small>&copy; 2022 <b>Abordo</b> - Todos os direitos reservados.</small>
        </div>
    </footer> 
        </div>
    );
}
export default Rodape;