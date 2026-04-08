# java_demo

一个最简洁的 Spring Boot REST 后端示例项目，无数据库依赖，开箱即用。

## 项目结构

```
java_demo/
├── pom.xml                          # Maven 构建配置
└── src/
    ├── main/
    │   ├── java/com/example/demo/
    │   │   ├── DemoApplication.java          # 启动入口
    │   │   └── controller/
    │   │       └── DemoController.java       # REST 接口
    │   └── resources/
    │       └── application.properties       # 应用配置
    └── test/
        └── java/com/example/demo/
            └── DemoApplicationTests.java    # 单元测试
```

## 接口列表

| 方法 | 路径 | 说明 |
|------|------|------|
| GET  | `/hello`      | 返回固定问候语 |
| GET  | `/user/{id}`  | 根据 id 返回用户信息 |
| POST | `/echo`       | 原样返回请求 JSON |

## 快速开始

### 环境要求

- JDK 17+
- Maven 3.6+

### 克隆项目

```bash
git clone https://github.com/zhouchao941105/java_demo.git
cd java_demo
```

### 本地运行

```bash
mvn spring-boot:run
```

服务启动后监听 `http://localhost:8080`。

也可以先打包再运行：

```bash
mvn package -DskipTests
java -jar target/java-demo-0.0.1-SNAPSHOT.jar
```

### 运行测试

```bash
mvn test
```

## curl 调试示例

**GET /hello**

```bash
curl http://localhost:8080/hello
# => {"msg":"Hello, world!"}
```

**GET /user/{id}**

```bash
curl http://localhost:8080/user/1
# => {"id":1,"name":"user1"}

curl http://localhost:8080/user/99
# => {"id":99,"name":"user99"}
```

**POST /echo**

```bash
curl -X POST http://localhost:8080/echo \
     -H "Content-Type: application/json" \
     -d '{"hello":"world","num":42}'
# => {"hello":"world","num":42}
```
