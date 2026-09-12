# Eventos_PL1_1
## Gestão de Eventos

Projeto desenvolvido no âmbito do Laboratório 1, com o objetivo de implementar um sistema simples de gestão de eventos, participantes e inscrições em Java.

---

## Objetivo do Projeto

O projeto tem como objetivo permitir a gestão de eventos, participantes e inscrições, disponibilizando as seguintes funcionalidades:

- Registar eventos e participantes;
- Registar uma inscrição, impedindo duplicados e respeitando a lotação;
- Confirmar ou cancelar uma inscrição;
- Listar os participantes confirmados de um evento;
- Indicar o número de vagas disponíveis;
- Apresentar o evento com maior número de inscrições confirmadas.
CRIAÇÃO DO CONFLITO A
---

## Estrutura do Projeto

```
eventos-grupoX/
├── src/
│   ├── Evento.java
│   ├── Participante.java
│   ├── Inscricao.java
│   ├── GereEventos.java
│   └── Teste.java
├── .gitignore
└── README.md
```

**Descrição das classes:**

| Classe          | Responsabilidade                                    |
|-----------------|------------------------------------------------------|
| `Evento`        | Representa um evento (dados e lotação)               |
| `Participante`  | Representa um participante                           |
| `Inscricao`     | Representa a inscrição de um participante e os respetivos estados |
| `GereEventos`   | Gere a coleção de eventos, participantes e inscrições |
| `Teste`         | Classe principal para testar as funcionalidades       |

---

## Participantes do Projeto

| Número  | Nome                              |
|---------|------------------------------------|
| 53986   | Ana Clara Pereira Souto            |
| 47303   | António Jorge Campos Santos        |
| 53255   | João Gonçalo Guedes Pinto          |
| 53035   | Mathias Fernando Concha Pando      |
| 53814   | Tiago Augusto Resende Saraiva      |

---

## Planeamento do Projeto / Distribuição de Tarefas

| Membro           | Responsabilidade Inicial     | Branch                 |
|-------------------|-------------------------------|--------------------------|
| António Santos | Classe `Evento`               | `feature/evento`        |
| João Pinto        | Classe `Participante`         | `feature/participante`  |
| Tiago Saraiva      | Classe `Inscricao` e estados  | `feature/inscricao`     |
| Mathias Pando      | Classe `GereEventos`          | `feature/gestao`        |
| Ana Souto           | Classe `Teste`                | `feature/menu`          |

---

## Instruções de Execução

### Pré-requisitos

- Ter o **Java Development Kit (JDK)** instalado (versão 11 ou superior recomendada).
- Verificar a instalação com:

```bash
java -version
javac -version
```

### Compilar o projeto

A partir da raiz do projeto, executar:

```bash
cd eventos-grupoX/src
javac *.java
```

### Executar o projeto

Após a compilação, executar a classe de teste:

```bash
java Teste
```

---

## Workflow Git/GitHub do Projeto

Este projeto segue o fluxo de trabalho distribuído definido no Laboratório 1 (Revisão Git e GitHub), sem alterações diretas à branch `main`.

### 4.1 Diagrama de classes
- [ ] Diagrama de classes desenhado, com nomes de atributos e métodos de `Evento`, `Participante`, `Inscricao`, `GereEventos` e `Teste`.

### 4.2 Preparação do repositório
- [ ] Repositório `eventos-grupoX` criado no GitHub com `README.md` e `.gitignore` (Java).
- [ ] Colegas de grupo convidados como colaboradores.
- [ ] Repositório partilhado com o docente da aula prática.
- [ ] Apenas o criador do repositório é o responsável; restantes membros com permissão de escrita.
- [ ] Todos os membros clonaram o repositório no Eclipse (clone, não download de ZIP) e importaram o projeto.
- [ ] Cada membro confirmou em **Team > Show in Repositories View**: branch atual, origin e endereço do remoto.

### 4.3 Sincronização antes de criar branch
Antes de iniciar cada nova funcionalidade, todos os membros confirmam:
- [ ] Mudança para a branch `main`;
- [ ] Execução de `Pull` para atualizar a `main` local;
- [ ] Ausência de alterações locais por guardar;
- [ ] Criação da nova branch a partir da `main` atualizada.

### 4.4 – 4.6 Branches, desenvolvimento e integração
- [ ] Cada membro criou a sua branch (`feature/evento`, `feature/participante`, `feature/inscricao`, `feature/gestao`, `feature/menu`).
- [ ] Cada membro desenvolveu a respetiva funcionalidade na sua branch.
- [ ] Cada funcionalidade foi integrada na `main` através de Pull Request, revisto por outro elemento do grupo.

### 5. Conflito provocado e resolvido
- [ ] Branch `conflito-A` (membro A) e `conflito-B` (membro B) criadas a partir da mesma `main`.
- [ ] Ambas as branches alteraram a mesma linha do `README.md` com textos diferentes.
- [ ] Pull Request de A revisto e integrado na `main`.
- [ ] B atualizou o remoto e tentou integrar `origin/main` na sua branch — conflito assinalado pelo Git.
- [ ] Conflito resolvido no Merge Tool do Eclipse (sem marcadores de conflito), testado e commitado.
- [ ] Branch de B publicada, novo Pull Request aberto com explicação de como o conflito foi resolvido.

> **Nota:** as caixas acima devem ser marcadas (`- [x]`) à medida que cada etapa é concluída pelo grupo, servindo como registo de confirmação do cumprimento do fluxo Git pedido no guião do laboratório.

---

## Notas

- O ficheiro `.gitignore` deve conter as pastas/ficheiros gerados pela compilação (ex.: `*.class`, `bin/`, `target/`, ficheiros de configuração local do Eclipse) para não serem versionados.
- Cada membro deve trabalhar na respetiva branch (`feature/...`) e integrar o código na branch principal através de *pull requests*/*merge* após revisão de outro elemento do grupo.
- Nenhuma alteração deve ser feita diretamente na branch `main`.
