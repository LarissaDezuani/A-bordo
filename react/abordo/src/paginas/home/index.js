import React from 'react';
//import { Link } from "react-router-dom";
//import Topo from '../../topo/Topo'
import Promocoes from '../Promocoes/Promocoes'

import './Index.css'

//import Rodape from './Rodape';
import {lazy, Suspense} from 'react';
const Topo = lazy(() => import('../../topo/Topo'))
const Index = () => {
    return(
        <div className='ban'>
            <Suspense fallback={<p>Carregamento</p>}>
            <Topo></Topo>
            </Suspense>
            <div className='banner'>  
            </div> 
            <Promocoes></Promocoes> 
            
            
                
        </div>
    )
}


export default Index;