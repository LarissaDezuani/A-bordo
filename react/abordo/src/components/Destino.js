import React from 'react';
import { Link } from "react-router-dom";
import App  from "../App"

const Destino = () => {
    return(
        <div>
                <App/>
                <h1>aqui e a pagina <strong>Destino</strong></h1>
                <Link to="/"> home</Link>
            
            
        </div>
    )
}

export default Destino;