# Intellij-java-test

IntellijでJavaのテストをするまでのHelloWorld

1. File -> New -> ProjectでJavaのプロジェクトを作成
2. srcに適当なクラスを作ってテストしたいコードを記述
3. srcと同階層にtestフォルダを作成
4. File -> Project Stracture -> Modulesのタブでtestを"Tests"に指定
5. testフォルダ配下が緑色に
6. Librariesタブに移動し、+ -> from Maven... -> junitと入力して検索
7. junit4などを組み込む
8. 適当なクラスにカーソルを合わせて右クリック -> Go to -> Test -> Create New Test...
9. さきほど組み込んだjunit4などを指定し、テストしたい関数を選択
10. 作ったファイルにテストを書く
11. build -> runでテスト実行

finish!
