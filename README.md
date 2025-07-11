# my-app-project

このプロジェクトは React（Vite）と Spring Boot を組み合わせたフルスタックWebアプリケーションです。

## 📁 ディレクトリ構成

```
my-app-project/
├── backend/   # Spring Boot API（Java）
└── frontend/  # React (Vite + TypeScript)
```

## 🚀 起動方法

### バックエンド（Spring Boot）

```bash
cd backend
./mvnw spring-boot:run
```

- サーバー起動: http://localhost:8080

### フロントエンド（React + Vite）

```bash
cd frontend
npm install
npm run dev
```

- アプリ起動: http://localhost:5173

## 🌐 API エンドポイント例

- `GET /api/hello?name=React`
- `POST /api/hello?name=React`
- `PUT /api/hello?name=React&newName=Next`
- `DELETE /api/hello?name=React`

## 🛠 使用技術

- React (Vite + TypeScript)
- Spring Boot 3
- Java 21
- REST API

## 📝 ライセンス

MIT