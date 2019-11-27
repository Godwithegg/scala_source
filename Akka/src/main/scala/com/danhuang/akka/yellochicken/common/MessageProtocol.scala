package com.danhuang.akka.yellochicken.common

//使用样例类来构建协议
//客户端发给服务器协议（序列化的对象）
case class ClientMessage(mes:String)

//服务器端发给客户端的协议（样例类）
case class ServerMessage(mes:String)
