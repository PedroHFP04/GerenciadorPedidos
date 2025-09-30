# Gerenciador de Pedidos

![Status do Pipeline](https://github.com/SEU-USUARIO/SEU-REPOSITORIO/actions/workflows/pipeline.yml/badge.svg)

Este projeto é uma aplicação de gerenciamento de pedidos em Java, desenvolvida com Maven. Ele inclui testes unitários utilizando JUnit e Mockito, e um pipeline de CI/CD configurado no GitHub Actions para automatizar a execução dos testes, o build da aplicação e o envio de notificações.

---
## Funcionalidades

* **Gerenciamento de Pedidos:** Permite criar e confirmar pedidos.
* **Controle de Estoque:** Realiza a atualização do estoque de produtos.
* **Testes Unitários:** Ampla cobertura de testes para garantir a robustez da aplicação.

---
##  Tecnologias Utilizadas

* **Java 21:** Linguagem de programação.
* **Maven:** Gerenciamento de dependências e automação de build.
* **JUnit:** Framework para testes unitários.
* **Mockito:** Framework para criação de mocks e simulação de comportamentos.
* **GitHub Actions:** Automação de workflow de CI/CD.

---
##  Como Executar

### Pré-requisitos
Certifique-se de ter o **JDK 21** e o **Maven** instalados em sua máquina.

### Execução Local
1.  Clone o repositório:
    ```sh
    git clone [https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git](https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git)
    cd GerenciadorPedidos
    ```
2.  Execute os testes unitários com Maven:
    ```sh
    mvn test
    ```
3.  Faça o build do projeto e gere o arquivo `.jar`:
    ```sh
    mvn package
    ```

### Pipeline de CI/CD (GitHub Actions)
Este projeto possui um pipeline automatizado que é acionado a cada `push` para a branch `main`. O pipeline executa as seguintes etapas:
* **Testes:** Roda todos os testes unitários.
* **Build:** Empacota a aplicação em um arquivo `.jar`.
* **Notificação:** Envia um e-mail cada vez que um push for executado.

---
### Observação

Lembre-se de substituir **`SEU-USUARIO`** e **`SEU-REPOSITORIO`** pelos dados do seu repositório no GitHub.
