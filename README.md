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
