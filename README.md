# 👽 Spring Security JWT

# 📑 Sobre o projeto 

A aplicação **Java** implementa um sistema robusto de autenticação e autorização utilizando as poderosas funcionalidades oferecidas pelo **Spring Security** em conjunto com **JSON Web Tokens (JWT)**. O **Spring Security** proporciona uma camada de segurança avançada, permitindo controlar o acesso aos recursos da aplicação com base em papéis de usuário, configurações de permissões e autenticação multifatorial. Com o uso de **JWT**, a aplicação consegue gerenciar de forma eficiente e segura os tokens de autenticação, garantindo a integridade e a confiabilidade do processo de autenticação, o que resulta em uma experiência de usuário mais segura e confiável.


## 📚 Stack Tecnológica

<div style="display: flex; align-items: center;">
  
  [![Badge](https://img.shields.io/badge/Java-17-%23FFA500?style=flat&logo=java&logoColor=white)](https://www.oracle.com/java/)
  [![Badge](https://img.shields.io/badge/Spring%20Boot-3.2.3-%236DB33F?style=flat&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
  [![Badge](https://img.shields.io/badge/JWT-JSON%20Web%20Token-%23000000?style=flat&logo=json-web-tokens&logoColor=white)](https://jwt.io/)
  [![Badge](https://img.shields.io/badge/Spring%20Security-5.7-%236DB33F?style=flat&logo=spring-security&logoColor=white)](https://spring.io/projects/spring-security)
  [![Badge](https://img.shields.io/badge/Spring%20MVC-5.3.13-%236DB33F?style=flat&logo=spring&logoColor=white)](https://spring.io/projects/spring-framework)
  [![Badge](https://img.shields.io/badge/Spring%20Data%20JDBC-2.3.1-%236DB33F?style=flat&logo=spring&logoColor=white)](https://spring.io/projects/spring-data-jdbc)
  [![Badge](https://img.shields.io/badge/H2-1.4.200-%23FF6F61?style=flat&logo=h2&logoColor=white)](https://www.h2database.com/html/main.html)

<p>
    <img src="./public/menina.gif" alt="Computador iuriCode" min-width="300px" max-width="300px" width="300px" align="right">
</p>
</div>

# 🚀 Como executar o projeto 🚀

## ⚙ Pré-requisitos

Para testar a aplicação **Spring Security JWT**, é necessário ter o **HTTPie** instalado em seu computador. 

[![Badge](https://img.shields.io/badge/HTTPie-2.6.0-%230A8CC1?style=flat&logo=httpie&logoColor=white)](https://httpie.io/)


O HTTPie CLI pode ser instalado em qualquer sistema operacional através do seguinte comando:

```
snap install httpie
```

## ⬇️ Clonar repositório git

```
git clone https://github.com/DenissonPereira/sping-security-jwt.git
```

## 👷 Construir o projeto

```
./mvnw clean package
```

## ✨ Tudo pronto! ✨

Para testar o projeto, basta seguir os comandos:

```
http -a username:password POST :8080/authenticate
```

```
JWT=(token gerado aqui)
```

```
http :8080/private Authorization:"Bearer ${JWT}"
```

# 🚨 Aguarde! Ainda não terminou!

>Esta aplicação foi desenvolvida com base nas aulas ministradas por Giuliana Bezerra, uma fonte inspiradora de conhecimento. Encorajamos a todos a explorar o repositório de Giuliana Bezerra para obter mais insights e aprender com suas contribuições.

>Além disso, gostaríamos de ressaltar que este projeto é aberto a contribuições de qualquer pessoa interessada em colaborar. Se você tem ideias, sugestões ou melhorias para oferecer, sinta-se à vontade para participar do desenvolvimento do projeto. Juntos, podemos criar algo incrível e beneficiar a comunidade de forma colaborativa.

## 📜 Licença

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/DenissonPereira/sping-security-jwt/blob/main/LICENSE) 

## ✏️ Autor 

Denisson Pereira Santos

<div> 
<a href="https://www.linkedin.com/in/denisson-pereira" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white"  target="_blank"></a> 
<a href="https://denissonpereira.com" target="_blank"><img src="https://img.shields.io/badge/Meu%20Site-%2333cc33?style=for-the-badge&logo=fontawesome&logoColor=white&logoWidth=15&labelColor=black"  target="_blank"></a> 
<a href="https://github.com/DenissonPereira" target="_blank"><img src="https://img.shields.io/badge/GitHub-%23181717?style=for-the-badge&logo=github&logoColor=white&logoWidth=15&labelColor=black"  target="_blank"></a> 
<a href="https://www.instagram.com/denisson_pereira1?igshid=OGQ5ZDc2ODk2ZA%3D%3D&utm_source=qr" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white"></a>
</div>&nbsp;&nbsp;