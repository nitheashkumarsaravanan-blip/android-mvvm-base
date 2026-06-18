<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=150&section=header&text=Android%20MVVM%20Base&fontSize=40&fontColor=fff&animation=twinkling&fontAlignY=35&desc=Clean%20Architecture%20%7C%20Hilt%20%7C%20Retrofit%20%7C%20Coroutines&descAlignY=60&descSize=16"/>

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![MVVM](https://img.shields.io/badge/MVVM-Architecture-blue?style=flat-square)
![Hilt](https://img.shields.io/badge/Hilt-DI-orange?style=flat-square&logo=android&logoColor=white)
![Retrofit](https://img.shields.io/badge/Retrofit-Networking-48B983?style=flat-square)
![License](https://img.shields.io/badge/License-Apache%202.0-blue?style=flat-square)

</div>

---

## 📌 Overview

A **production-ready base MVVM architecture** for Android applications built using modern Android development tools and best practices. This project demonstrates a clean, scalable, and maintainable architecture using the **News API** as a real-world data source.

---

## ✨ Features

- 🏗️ **MVVM Architecture** — clean separation of UI, business logic, and data
- 💉 **Hilt** — compile-time safe Dependency Injection
- 🌐 **Retrofit + OkHttp** — type-safe HTTP networking with logging
- ⚡ **Kotlin Coroutines + LiveData** — reactive, non-blocking async operations
- 📦 **ViewBinding** — null-safe, type-safe view references
- 🔍 **Debounced Search** — smart search with 500ms debounce via Coroutines
- 🔃 **SwipeRefreshLayout** — pull-to-refresh support
- 🖼️ **Glide** — smooth image loading with placeholder and crossfade
- 🧭 **Navigation Component** — single-activity navigation with Safe Args
- ✅ **Resource Wrapper** — unified `Loading / Success / Error` state handling
- 🌐 **WebView Detail Screen** — opens full article in-app

---

## 🗂️ Project Structure

```
com.nitheang.mvvm
│
├── 📂 data
│   ├── 📂 api              → NewsApi.kt          (Retrofit endpoints)
│   ├── 📂 model            → NewsResponse.kt     (Data classes / DTOs)
│   └── 📂 repository       → NewsRepository.kt   (Single source of truth)
│
├── 📂 di
│   └── AppModule.kt        → OkHttp, Retrofit, NewsApi providers
│
├── 📂 ui
│   ├── 📂 base             → MainActivity.kt     (NavHostFragment)
│   └── 📂 news
│       ├── NewsFragment.kt     → Headlines list + search UI
│       ├── NewsViewModel.kt    → State management + business logic
│       ├── NewsAdapter.kt      → RecyclerView ListAdapter with DiffUtil
│       └── DetailFragment.kt   → WebView article reader
│
├── 📂 utils
│   ├── Resource.kt         → Sealed class: Loading / Success / Error
│   └── Extensions.kt       → View show/hide helpers
│
└── MyApp.kt                → @HiltAndroidApp entry point
```

---

## 🛠️ Tech Stack

| Category | Technology |
|----------|-----------|
| Language | Kotlin |
| UI Layer | XML Views + ViewBinding |
| Architecture | MVVM + Repository Pattern |
| Dependency Injection | Hilt 2.50 |
| Networking | Retrofit 2.9 + OkHttp 4.12 |
| Async | Kotlin Coroutines + LiveData |
| Image Loading | Glide 4.16 |
| Navigation | Navigation Component 2.7 |
| Build | Gradle 8.2 + AGP |

---

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog or later
- Minimum SDK 24
- Target SDK 34

### Step 1 — Clone the Repository
```bash
git clone https://github.com/nitheashkumarsaravanan-blip/android-mvvm-base.git
cd android-mvvm-base
```

### Step 2 — Get a News API Key
1. Go to [newsapi.org](https://newsapi.org) and sign up for free
2. Copy your API key from the dashboard

### Step 3 — Add Your API Key
Open `app/build.gradle` and replace the placeholder:
```groovy
buildConfigField "String", "NEWS_API_KEY", '"YOUR_NEWS_API_KEY_HERE"'
```

### Step 4 — Build & Run
```
Sync Gradle → Run on emulator or device ✅
```

---

## 🔄 Architecture Diagram

```
         ┌──────────────────────────────────┐
         │            UI Layer              │
         │   NewsFragment / DetailFragment  │
         │         (observes LiveData)      │
         └────────────────┬─────────────────┘
                          │
         ┌────────────────▼─────────────────┐
         │          ViewModel Layer         │
         │           NewsViewModel          │
         │   (LiveData + Coroutines + Hilt) │
         └────────────────┬─────────────────┘
                          │
         ┌────────────────▼─────────────────┐
         │         Repository Layer         │
         │          NewsRepository          │
         │    (wraps result in Resource)    │
         └────────────────┬─────────────────┘
                          │
         ┌────────────────▼─────────────────┐
         │           Data Layer             │
         │     NewsApi (Retrofit + OkHttp)  │
         │       newsapi.org REST API       │
         └──────────────────────────────────┘
```

---

## 📦 Resource State Handling

All API responses are wrapped in a sealed `Resource` class:

```kotlin
sealed class Resource<out T> {
    data class Success<out T>(val data: T)  : Resource<T>()
    data class Error(val message: String)   : Resource<Nothing>()
    object Loading                          : Resource<Nothing>()
}
```

Usage in Fragment:
```kotlin
viewModel.headlines.observe(viewLifecycleOwner) { resource ->
    when (resource) {
        is Resource.Loading -> showProgressBar()
        is Resource.Success -> showData(resource.data)
        is Resource.Error   -> showError(resource.message)
    }
}
```

---

## 📄 License

```
Copyright 2025 Nitheash Kumar Saravanan

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

---

<div align="center">

Made with ❤️ by [Nitheash Kumar Saravanan](https://www.linkedin.com/in/nitheash-kumar-saravanan-5585412a8)

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=100&section=footer&animation=twinkling"/>

</div>
