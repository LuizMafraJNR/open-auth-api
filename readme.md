# 🚀 API de Login Open Source

## 📌 Sobre o Projeto

Esta API de Login foi desenvolvida como um projeto **open source** com foco em **treinamento e aprendizado**. O objetivo é fornecer uma base sólida para quem deseja entender a implementação de autenticação e autorização em aplicações modernas, seguindo boas práticas de organização de código e arquitetura.

Embora tenha sido criada para fins educacionais, a API está disponível para qualquer pessoa que queira **copiar, modificar e utilizar** em seus próprios projetos ou até mesmo contribuir para melhorias futuras.

---

## ⚙️ Tecnologias Utilizadas

- **Java 21+**
- **Spring Boot** (Framework principal)
- **Spring Security** (Autenticação e autorização)
- **JWT ou OAuth2** (Decidindo qual implementar)
- **Hibernate** (JPA para persistência de dados)
- **SQL Server** (Banco de dados relacional)
- **Lombok** (Redução de boilerplate code)
- **Mapstruct** (Conversão de objetos)
- **Swagger** (Documentação da API)

---

## 📂 Estrutura do Projeto

Utilizamos uma arquitetura **hexagonal** (ou **ports and adapters**) para organizar o código em camadas, facilitando a manutenção e evolução do projeto. A estrutura básica é:

```plaintext
com.seuprojeto
│── adapters
│   ├── in (Controladores REST, Mensageria, etc.)
│   ├── out (Repositórios JPA, Clientes API Externa, etc.)
│       ├── repository
│       │   ├── entity (Classes JPA)
│       │   ├── mapper (Conversão entre Model e Entity)
│── application
│   ├── core
│   │   ├── domain (Modelos de Domínio)
│   │   ├── usecase (Casos de uso)
│   ├── ports (Interfaces de comunicação)
│── config (Configuração de segurança,Injenção de Beans, JWT, etc.)
```

---

## 📌 Contribuição

Se você deseja contribuir com melhorias, siga os passos:

1. **Fork** este repositório 🍴
2. Crie uma **branch** com sua feature (`git checkout -b minha-feature`)
3. Faça **commit** das suas mudanças (`git commit -m 'Adicionando minha feature'`)
4. Envie um **push** para a branch (`git push origin minha-feature`)
5. Abra um **Pull Request** 📩


📢 **Dúvidas ou sugestões?** Sinta-se à vontade para abrir uma issue ou entrar em contato!

---

💻 **Desenvolvido por [Luiz Sesna Mafra Junior](https://github.com/LuizMafraJNR)** 🚀

