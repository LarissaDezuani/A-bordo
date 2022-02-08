
import Topo from '../topo/Topo';
import alagoas from './alagoas.jpg';
import saopaulo from './saopaulo.jpg';
import rio from './rio.jpg';
import fernando from './fernannoronha.jpg';
import amazonas from './amazonas.jpg';
import bahia from './bahia.jpeg'
import './Promocoes.css';
import App from '../App';
function Promocoes(){
    return(
     
<div>
  <App></App>
    <Topo></Topo>
    <main className='conteudo'>

    
<div className="cont">

    <div className="cards">
      <div className="cards-header">
        <img src={saopaulo} alt="rover" />
      </div>
      <div className="cards-body">
        
        <h4>
         São Paulo
        </h4>
        <p>
            São Paulo, centro financeiro do Brasil, está entre as cidades mais populosas do mundo, com diversas instituições culturais e uma rica tradição arquitetônica
        </p>
        <p>
            De R$100,00 por R$70,00
        </p>

 
           
      </div>
    </div>
    <div className="cards">
      <div className="cards-header">
        <img src={bahia} alt="ballons" />
      </div>
      <div className="cards-body">
        
        <h4>
          Bahia
        </h4>
        <p>
            A Bahia é um estado do nordeste brasileiro com paisagens que variam da costa tropical até a aridez do Sertão
        </p>
        <p>
            De R$100,00 por R$70,00
        </p>  
      </div>
    </div>
    <div className="cards">
      <div className="cards-header">
        <img src={rio} alt="city" />
      </div>
      <div className="cards-body">
        
        <h4>
          Rio de Janeiro
        </h4>
        <p>
            O Rio de Janeiro é uma grande cidade brasileira à beira-mar, famosa pelas praias de Copacabana e Ipanema, pela estátua de 38 metros de altura do Cristo Redentor
        </p>
        <p>
            De R$100,00 por R$70,00
        </p>
        
            
        
 
            
      </div>
    </div> 
    <div className="cards">
        <div className="cards-header">
          <img src={fernando} alt="city" />
        </div>
        <div className="cards-body">
          
          <h4>
            Fernando de noronha
          </h4>
          <p>
            Fernando de Noronha é um arquipélago vulcânico situado a cerca de 350 quilómetros ao largo da costa nordeste do Brasil.
          </p>
          <p>
              De R$100,00 por R$70,00
        </p>
        </div>
      </div> 
      <div className="cards">
        <div className="cards-header">
          <img src={amazonas}alt="city" />
        </div>
        <div className="cards-body">
          
          <h4>
            Amazonas
          </h4>
          <p>
            Amazonas é um enorme estado no noroeste do Brasil, coberto quase na sua totalidade pela floresta tropical da Amazónia.
          </p>
          <p>
            De R$100,00 por R$70,00
          </p>
 
          
        </div>
      </div> 
      <div className="cards">
        <div className="cards-header">
          <img src={alagoas} alt="city" />
        </div>
        <div className="cards-body">
          
          <h4>
          Alagoas
          </h4>
          <p>
          Alagoas é um pequeno estado do nordeste brasileiro cujo litoral tropical é marcado por praias de areia branca repletas de palmeiras, lagoas cristalinas e recifes de corais          </p>
          <p>
              De R$100,00 por R$70,00
            </p>
 
        </div>
      </div>
      </div> 
    </main>
</div>


    );
}
export default Promocoes;