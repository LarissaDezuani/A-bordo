
import './App.css';
import React, {useEffect, useState } from 'react';
import { Link } from "react-router-dom";

import Topo from './topo/Topo'
function App() {
// cria funcao para retornar
//posicaoScroll funcao para verificar e acompanho em qual posicao o sroll esta 
//eixo y e barra lateral
//se estiver nesta posicao= window.scrollY > 40 
//ele deve ativar a cor com a variavel da fncao
//useState 
 const[ativaCor, setAtivaCor] = useState(false)

  useEffect(function(){
    function posicaoScroll(){
     if(window.scrollY > 10 ) {
      setAtivaCor(true);
     }else{
       setAtivaCor(false);
     }
    }
//para q seja lido a todo tempo e preciso addEventListener
//nele vamos manipular o scroll e toda vez q for manipulado vai chamar a funçao posicaoScroll
    window.addEventListener('scroll', posicaoScroll );
  },
  []);

  return (
    <>
          {/* dentro do header vamos passar a  funcao para dentro do componente
          a variavel ativaCor que passa pela funcao q foi criada
           que foi armazenada nesta variavel
           prop=acao e dentro do topo vai receber  a prop acao/  */}
         <Topo acao={ativaCor}></Topo>
        
    


    </>  
    
    
  );
}
export default App;
