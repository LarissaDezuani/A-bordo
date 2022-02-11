import React from 'react';
//import { Link } from "react-router-dom";
import Topo from '../topo/Topo'
import Promocoes from './Promocoes';
import './Index.css'

//import Rodape from './Rodape';

const Index = () => {
    return(
        <div className='ban'>
           <Topo></Topo>
           <div className='banner'>
               
               
            </div> 
            <Promocoes></Promocoes>  
            
            
                
        </div>
    )
}


export default Index;