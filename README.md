Todoリストを作ることに決めた。
使用する予定の技術スタックは以下
・Java(Var 21)
・Spring Boot
・Maven
・Thymeleaf
・MySQL
などなど・・・

自分の日記的な感じでここは書いていきます。
技術力を上げることを目標にRestAPIのいい資料が見つかるまでとにかくこれだけやっていく予定。

//1日目
とりあえず帰るのが遅かったので、コントローラーとHTMLだけ作ってHalloWorldだけした。
なぜかプロジェクトを作るのに手間取ったが、（Mavenがエラーを吐いていたが、何回か再インストールしたら突然治った。）
ここからがスタート。
しっかりと毎日Gitにプッシュするのが目標。

//2日目
今日はDB接続情報とDB構築を実施した。
DB構築は忘れかけている部分もあったが、過去に勉強した動画を見ながら設計から実施した。
実際のSQL内のデータも追加したので、明日はCSSを作成して、時間があればToDoを表示するクラスたちを作っていこうと思う。

//3日目
今日はCSSとFormオブジェクトとDTO、error.htmlを作成した。
正直かなりから詰まってしまい、まだまだ身につけられていないなと実感した。
ただ、このページ以外にも登録、削除などなどつけたい機能はたくさんあるので、そこできちんと身につけていきたい。
褒められる点としては、つまりはしたが、何とかダミーデータをmodelに格納して表示するところまではできた。
明日はDBから情報を引っ張ってくるところをやりたいなと思うので、Service層とRepositoryを作成しようと思う。

//4日目
今日はDBと接続してDBからデータを引っ張ってこれるようにした。
割とすんなりとできたが、少し詰まった部分があった。
まずSQLのTimeStamp型をDate型にキャストしようとしてキャストエラーが出た。
次に空欄を入力したら全件検索できるようにするのを忘れていた。
それぞれ解決として、まずはDTOもDate型にしていたのでTimeStamp型を指定し、TimeStamp型にキャストした。
（TimeStamp型をJavaでインポートしたら使えるのを普通に知らなかった。）
次に全件検索はwhere文の"="を"like"に変更した。次に引数でもらっているuserIdを"%"で囲って部分一致で検索できるように
調整した。
明日はCSSを整えてもう少しToDoっぽくできるならいじりたいなと思う。
あとは登録をできるようにしたいと思う。

//5日目
昨日は眠すぎてダウン。金曜日は毎回ダウンするので定休日にしてもいいのだろうかと思い始めている。
ToDo登録機能を実装中。
今日は登録を一気に終わらせようと思ったが、メソッドよくわからんくなって頭こんがらがってるので一旦これでプッシュしようと思う
今日この後もう少しできそうな気がしたらエラー直しをしようと思う。できなかったら明日にやろうと思う。
CSSの修正も手が付けれていないが、いろいろ作ってからでもいい気がしなくもないので、気が向いたらちょこちょこやろうと思う

//6日目
今日はそもそもToDoが終わっているのかのステータスがないことに気づいてしまったのでカラムをDBに追加した。
それにあたってバックエンドも改修した。HTMLはステータスが終わっていない状態になっているものだけ表示されるように。
あしたはToDOで一番大事なToDoを終わらせたときにステータスを終了にする処理を追加しようと思う。

//7日目
今日は頭が回らな過ぎて断念。少し改造はしたが、全然完成はしていないし、何が何だか分からなくなってきた。
明日こそ完成させるために今日は早く寝ようと思う。

//8日目
今日はToDoを完了できるように調整できた。かなり詰まったところもあったが、わからない部分は調べたりAIに頼ったりした。
エラーメッセージをずっとAIに投げ続けていたが、それの成果かわからないが、前よりも明らかにエラーメッセージが読めるようになっていることに気づいた。
基本はまず検索するようにはしているが、使い方がわからなかったりするときに実例ベースでAIは回答を出してくれるので便利だなと思う。
明日は編集機能に手を付けようと思う。

//9日目
今日は眠すぎて明日の仕事に支障が出そうなのと最近寝坊しかけているのでコントローラーとフォームだけ作って終わり。
明日はできるだけ進めて最低でも画面遷移だけは編集画面を完成させたい。
正直これしかできないのが悔しい…！が、コツコツと、なるべく毎日続けていこうと思う。

//10日目
今日はバックエンドの部分を作成。だんだんと慣れてきた気はするが、ハイ作ってねだとまだ厳しい。
日々精進していこうと思う。あしたはフロントの部分を作りたい。
AOPを作ろう作ろうと思って忘れていたのでイシューに追加して忘れないようにしておこうと思う。

//11日目
編集機能が何だかうまくいかず…
どうにかなりそうなきもするが、今日はよくわからなくなってきたので次に持ち越し。
何とかなるといいが…

