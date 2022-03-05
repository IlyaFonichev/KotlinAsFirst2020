1. Сделан форк репозитория Kotlin-Polytech/KotlinAsFirst2020
2. Клонировал форк к себе на локальную машину
3. Указал в качестве upstream-my свой репозиторий IlyaFonichev/KotlinAsFirst2021
4. Произвел fetch, а затем создал ветку backport и перешел на нее
5. Произвел cherry-pick из upstream-my с d535f...FETCH_HEAD
6. В качестве второго апстрима upstream-theirs добавил репозиторий EgorShalak/KotlinAsFirst2021
7. Произвел fetch из upstream-theirs
8. Возврат на ветку master
9. Начал слияние master, backport и upstream-theirs/master (FETCH_HEAD) в master
10. Исправил конфликты
11. Завершил слияние и создал коммит этого слияния
12. Всё перенес в файл remotes
13. Создание файла howto.md и описал ход практики.