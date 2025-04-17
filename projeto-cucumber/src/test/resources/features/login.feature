#language: pt

Funcionalidade: Login no sistema

  Cenário: Login com credenciais válidas
    Dado que o usuário esteja na tela de login
    Quando o usuário digitar o nome de usuário "joao" e a senha "1234"
    E clicar no botão de login
    Então o sistema deve mostrar a mensagem "Login realizado com sucesso"

  Cenário: Login com credenciais inválidas
    Dado que o usuário esteja na tela de login
    Quando o usuário digitar o nome de usuário "joao" e a senha "senhaerrada"
    E clicar no botão de login
    Então o sistema deve mostrar a mensagem "Usuário ou senha inválidos"
