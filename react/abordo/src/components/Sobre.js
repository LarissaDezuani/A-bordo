import React from 'react';
import { Link } from "react-router-dom";
import App from "../App";

const Sobre = () => {
    return(
        <div>
            <App/>
                <h1>aqui e a pagina <strong>Sobre</strong></h1>
                <Link to="/"> home</Link>
            
            
        </div>
    )
}


export default Sobre;