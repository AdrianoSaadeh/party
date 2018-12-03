package br.edu.ulbra.election.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyController {
	
	//GET / - Página inicial do VOTER. Aqui se faz cadastro.
	@RequestMapping("/cadastro")
    public String home(){
        return "<!--Javascript Code in the same page as the form: -->\r\n" + 
        		"   <script type=\"text/javascript\">\r\n" + 
        		"$.fn.serializeObject = function()\r\n" + 
        		"{\r\n" + 
        		"    var o = {};\r\n" + 
        		"    var a = this.serializeArray();\r\n" + 
        		"    $.each(a, function() {\r\n" + 
        		"        if (o[this.name] !== undefined) {\r\n" + 
        		"            if (!o[this.name].push) {\r\n" + 
        		"                o[this.name] = [o[this.name]];\r\n" + 
        		"            }\r\n" + 
        		"            o[this.name].push(this.value || '');\r\n" + 
        		"        } else {\r\n" + 
        		"            o[this.name] = this.value || '';\r\n" + 
        		"        }\r\n" + 
        		"    });\r\n" + 
        		"    return o;\r\n" + 
        		"};\r\n" + 
        		"\r\n" + 
        		"$(function() {\r\n" + 
        		"    $('form').submit(function() {\r\n" + 
        		"        $('#result').text(JSON.stringify($('form').serializeObject()));\r\n" + 
        		"        return false;\r\n" + 
        		"    });\r\n" + 
        		"});\r\n" + 
        		" \r\n" + 
        		"</script>\r\n" + 
        		"<body style=\"background: #e4e4e4; width: 1000px; margin: 0 auto; font-family: 'Open Sans';\">\r\n" + 
        		"<div class=\"menu-link\" style=\"text-align: center; margin: 0 auto; width: 600px; font-family: 'Open Sans'; margin-top: 20px;\">\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; border-radius: 10px 0 0 10px; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8081/cadastro\" style=\"text-decoration: none; color: #000;\">VOTER</a>\r\n" + 
        		"		</div>\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8082/cadastro\" style=\"text-decoration: none; color: #000;\">CANDIDATE </a>\r\n" + 
        		"		</div>\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8083/cadastro\" style=\"text-decoration: none; color: #000;\">PARTY </a> \r\n" + 
        		"		</div>\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; border-radius: 0 0 0 0;  padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8084/cadastro\" style=\"text-decoration: none; color: #000;\">ELECTION  </a>\r\n" + 
        		"		</div>\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; border-radius: 0 10px 10px 0;  padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8081/login\" style=\"text-decoration: none; color: #000;\"><strong>VOTAR</strong>  </a>\r\n" + 
        		"		</div>\r\n" + 
        		"	</div>\r\n" + 
        		"	<br>\r\n" + 
        		"	<div style=\"width: 200px; margin: 0 auto; margin-top: 30px; text-align: center;font-weight: 600;\">\r\n" + 
        		"		PARTY\r\n" + 
        		"	</div>\r\n" + 
        		"	<div style=\"background: #fff; padding: 30px; width: 800px; margin: 0 auto; margin-top: 10px; border-radius: 10px;	padding-top: 50px;box-shadow: 0 8px 36px -6px black;\">\r\n" + 
        		"\r\n" + 
        		"		<DIV>\r\n" + 
        		"			<div id=\"topBar\"> Ver todos os partidos <a href =\"#\" onclick=\"load_home()\" style=\"text-decoration: none; color: #000;\"> [ + ] </a> <a href=\"http://localhost:8083/cadastro\"  style=\"text-decoration: none; color: #000;\"> [ - ]</a></div>\r\n" + 
        		"			<div id =\"contentPartidos\"> </div>\r\n" + 
        		"			<script>\r\n" + 
        		"				  function load_home() {\r\n" + 
        		"				 document.getElementById(\"contentPartidos\").innerHTML='<object style=\"width: 600px; border: 1px solid;\" type=\"text/html\" data=\"http://localhost:8083/v1/party/\" ></object>';\r\n" + 
        		"			}\r\n" + 
        		"			</script>\r\n" + 
        		"		</DIV>\r\n" + 
        		"		\r\n" + 
        		"		<br>		\r\n" + 
        		"		<hr>\r\n" + 
        		"\r\n" + 
        		"		\r\n" + 
        		"		<div style=\"margin-top: 20px; \">\r\n" + 
        		"		Cadastrar novo partido:\r\n" + 
        		"			<form id=\"myForm\" action=\"http://localhost:8083/v1/party/\"  target=\"\" onsubmit='return onSubmit(this)'>\r\n" + 
        		"			  <div class=\"form-field\">\r\n" + 
        		"				<input name=\"code\" id=\"code\" placeholder=\"Sigla\" type=\"text\" >\r\n" + 
        		"				<input name=\"name\" id=\"name\" placeholder=\"Nome\" type=\"text\" >\r\n" + 
        		"				<input name=\"number\" id=\"number\" placeholder=\"Número\" type=\"text\" >\r\n" + 
        		"			  </div>\r\n" + 
        		"				<br>\r\n" + 
        		"			 <input type=\"submit\" name=\"postAd\" id=\"postAd\" class=\"button\" value=\"Cadastrar\">\r\n" + 
        		"			 \r\n" + 
        		"				<pre id=\"result\">\r\n" + 
        		"				</pre>\r\n" + 
        		"				\r\n" + 
        		"				\r\n" + 
        		"			</form>\r\n" + 
        		"\r\n" + 
        		"			<script type=\"text/javascript\">\r\n" + 
        		"			  window.onload = function() {\r\n" + 
        		"				document.getElementById(\"myForm\").onsubmit = function() {\r\n" + 
        		"				  var msgElement = document.getElementById(\"myMessage\");\r\n" + 
        		"				  msgElement.value = ' ' + msgElement.value;\r\n" + 
        		"				  alert(msgElement.value); //comment/remove this line\r\n" + 
        		"				  return true;\r\n" + 
        		"				};\r\n" + 
        		"			  };\r\n" + 
        		"			</script> \r\n" + 
        		"		</div>\r\n" + 
        		"\r\n" + 
        		"		<hr>\r\n" + 
        		"		\r\n" + 
        		"		<div style=\"margin-top: 20px; \">\r\n" + 
        		"		Buscar partido:\r\n" + 
        		"		\r\n" + 
        		"		<form id=\"myForm1\" target=\"_blank\">\r\n" + 
        		"			<input name=\"code1\" id=\"code1\" placeholder=\"ID partido\" type=\"text\" >\r\n" + 
        		"			<a href=\"#\" onclick=\"this.href='http://localhost:8083/v1/party/'+document.getElementById('code1').value\" >\r\n" + 
        		"			<input type=\"button\" value=\"Buscar \">\r\n" + 
        		"			\r\n" + 
        		"			</a>\r\n" + 
        		"        </form >\r\n" + 
        		"		\r\n" + 
        		"		\r\n" + 
        		"		<hr>\r\n" + 
        		"		\r\n" + 
        		"		<div style=\"margin-top: 20px; \">\r\n" + 
        		"		Alterar partido:\r\n" + 
        		"		\r\n" + 
        		"		<form id=\"myForm2\" target=\"_blank\">\r\n" + 
        		"			<input name=\"code2\" id=\"code2\" placeholder=\"ID partido\" type=\"text\" >\r\n" + 
        		"			<a href=\"#\" onclick=\"this.href='http://localhost:8083/v1/party/'+document.getElementById('code2').value\" >\r\n" + 
        		"			<input type=\"button\" value=\"Buscar \">\r\n" + 
        		"			\r\n" + 
        		"			</a>\r\n" + 
        		"        </form >\r\n" + 
        		"		\r\n" + 
        		"		\r\n" + 
        		"		<form id=\"myForm2-1\" action=\"http://localhost:8083/v1/party/\"  target=\"\" onsubmit='return onSubmit(this)'>\r\n" + 
        		"			  <div class=\"form-field\">\r\n" + 
        		"				<input name=\"code3\" id=\"code3\" placeholder=\"Sigla\" type=\"text\" >\r\n" + 
        		"				<input name=\"name\" id=\"name\" placeholder=\"Nome\" type=\"text\" >\r\n" + 
        		"				<input name=\"number\" id=\"number\" placeholder=\"Número\" type=\"text\" >\r\n" + 
        		"			  </div>\r\n" + 
        		"				<br>\r\n" + 
        		"			 <input type=\"submit\" name=\"postAd\" id=\"postAd\" class=\"button\" value=\"Alterar\">\r\n" + 
        		"			 \r\n" + 
        		"				<pre id=\"result\">\r\n" + 
        		"				</pre>\r\n" + 
        		"				\r\n" + 
        		"		</form>\r\n" + 
        		"\r\n" + 
        		"		</div>\r\n" + 
        		"		\r\n" + 
        		"			\r\n" + 
        		"		<hr>\r\n" + 
        		"		\r\n" + 
        		"		<div style=\"margin-top: 20px; \">\r\n" + 
        		"		Deletar partido:\r\n" + 
        		"		\r\n" + 
        		"		<form id=\"myForm2\" target=\"_blank\">\r\n" + 
        		"			<input name=\"code4\" id=\"code4\" placeholder=\"ID partido\" type=\"text\" >\r\n" + 
        		"			<a href=\"#\" onclick=\"this.href='http://localhost:8083/v1/party/'+document.getElementById('code4').value\" >\r\n" + 
        		"			<input type=\"button\" value=\"Deletar \">\r\n" + 
        		"			\r\n" + 
        		"			</a>\r\n" + 
        		"        </form >\r\n" + 
        		"		\r\n" + 
        		"\r\n" + 
        		"		</div>\r\n" + 
        		"</body>\r\n" + 
        		"\r\n" + 
        		""
        		
        		
        		
        		;
    }/*ate aqui ok*/
	
}
