# ⚡ Real-Time Data Streaming with Spring Boot & Kafka 🚀

Welcome to **KafkaProjectWithProducerAndConsumer** — a real-time streaming application built using **Spring Boot** and **Apache Kafka**.

This project fetches **live events** from the [Wikimedia Recent Changes API](https://stream.wikimedia.org/v2/stream/recentchange), produces them to a **Kafka topic**, and then consumes and processes them live using a **Kafka consumer**.

---

## 🎯 What This Project Demonstrates

- 🔄 Consumes real-time live data from a public stream (Wikimedia)
- ⚙️ Publishes data to Kafka using a Spring Boot **Kafka Producer**
- 📥 Listens to the topic using a **Kafka Consumer**
- 📡 Simulates real-world event-driven systems for analytics, logging, or monitoring

---

## 🛠️ Tech Stack

| Component      | Technology         |
|----------------|--------------------|
| Language       | Java 17            |
| Framework      | Spring Boot 3      |
| Messaging      | Apache Kafka       |
| Live API       | Wikimedia SSE API  |
| Kafka Support  | Spring Kafka       |
| Build Tool     | Maven              |
| Utilities      | Lombok, SLF4J      |

---

## 🚦 Modules Overview

### 🛰️ Kafka Producer
- Connects to the **Wikimedia live stream**
- Captures every change/event in real time (per second)
- Pushes the JSON message into a Kafka topic (e.g., `wikimedia_recent_change`)

### 🎧 Kafka Consumer
- Subscribes to the same topic
- Listens to incoming real-time events
- Logs, displays, or further processes the data

---
