import './Sobre.css'
import React from 'react';
import { Link } from "react-router-dom";
import App from "../App";
import Rodape from '../rodape/Rodape'
const Sobre = () => {
    return(
        <div >
            <App/>
            <h1>aqui e a pagina <strong>Sobre</strong></h1>
            
            <Rodape></Rodape>
            
                
        </div>
    )
}


export default Sobre;