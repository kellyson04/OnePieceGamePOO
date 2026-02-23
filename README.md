# OnePieceGamePOO
**projeto focado em profissionalizar o uso de orientação de objetos antes de aprender Spring Boot.**

.

**13/02/2026 🏴‍☠️🚢🌊 One Piece Game: Minha Evolução em POO**
  * Saí da bagunça que estava fazendo nos arquivos em um antigo projeto e separei o jogo em pacotes: account para o login e game para a aventura. Seguindo os principios do **Clean Code**.*
  * *Regra fixa com Enums:* Usei Enums para garantir que ou você é Pirata ou é Marinheiro, sem erro de digitação no sistema, **uso de Enums ainda em aprendizado**
  * *Flexibilidade Sobrecarga:* **Aprendi a usar Sobrecarga de Construtor**, então o personagem pode nascer sem habilidades de fruta(só no Haki) ou já com uma Akuma no Mi.*
  * *Contrato de Batalha:* (Interfaces): Criei uma interface de Ataque pra obrigar todo player a ter um ataque, padronizando o estilo de luta do jogo, **Uso de Interfaces ainda em aprendizado**.
  * *Salvando o Tesouro:* sistema com BufferedWriter que salva os dados em .txt, garantindo a continuidade dos dados do game mesmo se o pc desligar.
    
**22/02/2026 🏴‍☠️🚢🌊 One Piece Game: Novas Implementações: Dinâmica de Combate⚔️, Dialogos💬 e Arquitetura POO**
  * *Classe InimigoNPC:* Criei do zero o molde para os bosses. Agora cada vilão (Ex: Alvida, Bellamy, Bege, Kid) é um objeto independente com seu próprio HP, golpe especial e dano específico.
  * *Motor de Batalha (SistemaCombate):* Isolei toda a lógica de batalha em uma classe própria. Ela gerencia o loop de turnos (while), a escolha de ações do player e o contra-ataque do NPC.
  * *Diálogos Profissionais (DialogosNPCs):* Criei uma classe utilitária para as falas dos NPCs. Elas agora retornam String, o que evita poluir o Controller com System.out.println e deixa o código muito mais organizado.
  * *Injeção de Dependência nas Batalhas:* Agora as lutas funcionam via parâmetros. ainda acostumando com essa ferramenta magica, eu injeto o objeto do Personagem e do InimigoNPC dentro da arena, garantindo que o combate seja universal para qualquer luta.
  * * Controle de Tempo (Timers):* Implementei timers com Thread.sleep (tratados com try-catch) para criar um delay entre os turnos, só pra ficar mais bonitin kkkk. Agora o jogo tem ritmo de Tibia ou RPG, dando tempo para o jogador ler o que aconteceu no combate.
