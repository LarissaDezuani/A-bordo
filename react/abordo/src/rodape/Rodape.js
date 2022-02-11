import './Rodape.css'
import insta from '../rodape/instagram.png'
import face from './facebook.png'
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
                    </a>
                </figure>
            </div>
            <div class="box">
                
                <a ><Link to="/sobre"><h2>Sobre nossa história</h2></Link></a>
                <p>is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</p>
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