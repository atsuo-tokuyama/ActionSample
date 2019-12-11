# ActionSample
GitHub Actionsを使ったビルドの検証

簡単なAndroidアプリのCI環境をGitHub Actionsで作成しました。
.github/workflows/android.ymlを参照してください。

やっている内容は以下の通り

Debug APKを作成する
ユニットテストを実行する
ユニットテストの結果をアップロード
完了をSlackで通知（正常終了、ビルドエラー、テスト失敗）


