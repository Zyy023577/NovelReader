# 📚 NovelReader

一个基于 Android 原生开发的小说阅读器应用，采用 Java + Room 数据库实现本地小说管理与阅读功能。

## 项目简介

NovelReader 是一款轻量级小说阅读器，用户可以在书架中管理自己的小说，通过阅读页面查看小说内容，并利用本地数据库实现数据持久化存储。

本项目作为 Android 移动应用开发课程设计项目完成。

---

## 功能特点

### 📖 书架管理

* 显示小说列表
* RecyclerView 动态展示书籍
* 添加新小说
* 本地保存书籍信息

### 📚 阅读功能

* 点击书籍进入阅读页面
* 显示当前阅读小说名称
* 支持后续扩展章节阅读

### 💾 数据持久化

* 使用 Room 数据库
* 本地存储书籍数据
* 应用重启后数据不丢失

### 🎨 用户界面

* 简洁直观的书架界面
* Android Material Design 风格
* 良好的用户交互体验

---

## 技术栈

### 开发环境

* Android Studio
* Java
* Gradle

### 核心技术

* RecyclerView
* Activity
* Intent 页面跳转
* Room Database
* SQLite
* Material Components

---

## 项目结构

```text
app
├── java/com/example/novelreader
│   ├── MainActivity.java
│   ├── ReadActivity.java
│   ├── Book.java
│   ├── BookAdapter.java
│   ├── BookDao.java
│   └── AppDatabase.java
│
└── res
    ├── layout
    │   ├── activity_main.xml
    │   ├── activity_read.xml
    │   └── item_book.xml
    │
    └── drawable
```

---

## 数据库设计

### Book 表

| 字段    | 类型     | 说明   |
| ----- | ------ | ---- |
| id    | int    | 主键   |
| title | String | 小说名称 |

---

## 核心实现

### RecyclerView 书架展示

使用 RecyclerView 实现小说列表动态加载，提高界面性能和可扩展性。

### Room 数据库

采用 Room 作为 SQLite 的 ORM 框架：

* Book 实体类
* BookDao 数据访问接口
* AppDatabase 数据库管理类

### Activity 跳转

通过 Intent 实现：

```java
Intent intent = new Intent(
        MainActivity.this,
        ReadActivity.class
);
```

完成书架页与阅读页之间的跳转。

---

## 运行效果

### 首页

* 显示书架
* 添加小说

### 阅读页

* 显示当前小说名称
* 阅读内容展示

---

## 后续优化方向

* 阅读进度保存
* 夜间模式
* 删除小说
* 搜索功能
* TXT 文件导入
* EPUB 阅读支持
* 字体大小调整
* 书签功能

---

## 开发者

姓名：张艺扬

班级：计算机科学与技术2305班

项目类型：Android 移动应用课程设计

开发时间：2026.6.19

---

## License

This project is for educational purposes only.
