import React from "react";
import './Rodape.css';
//import { Link } from "react-router-dom";
//import App from "../App"

const Rodape = () => {
    return(
        <div>
            
            
    <div class="footer-clean">
        <footer>
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-sm-4 col-md-3 item">
                        <h3>Serviços</h3>
                        <ul>
                            <li><a href="#">viagem</a></li>
                            <li><a href="#">Babagem</a></li>
                            <li><a href="#">Hospedagem</a></li>
                        </ul>
                    </div>
                    <div class="col-sm-4 col-md-3 item">
                        <h3>Sobre</h3>
                        <ul>
                            <li><a href="#">Empresa</a></li>
                            <li><a href="#">Time</a></li>
                            
                        </ul>
                    </div>
                    <div class="col-sm-4 col-md-3 item">
                        <h3>Careers</h3>
                        <ul>
                            <li><a href="#">Job openings</a></li>
                            <li><a href="#">Employee success</a></li>
                            <li><a href="#">Benefits</a></li>
                        </ul>
                    </div>
                    <div class="col-lg-3 item social"><a href="#"><i class="icon ion-social-youtube"></i></a><a href="#"><i class="icon ion-social-facebook"></i></a><a href="#"><i class="icon ion-social-instagram"></i></a>
                        <p class="copyright">A-bordo © 2022</p>
                    </div>
                </div>
            </div>
        </footer>
    </div>
    </div>
    )
}
export default Rodape;