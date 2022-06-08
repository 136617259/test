//package com.mpaas.tiramisu
//
//import android.Manifest
//import android.app.Activity
//import android.app.Notification
//import android.app.NotificationManager
//import android.content.Context
//import android.graphics.BitmapFactory
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import androidx.core.app.ActivityCompat
//import androidx.core.app.NotificationCompat
//import android.app.NotificationChannel
//import android.content.Intent
//import android.net.Uri
//import android.os.Build
//import android.provider.MediaStore
//import androidx.annotation.RequiresApi
//import androidx.fragment.app.FragmentActivity
//import java.util.*
//
//
//class MainActivity : FragmentActivity() {
//    var permissions = arrayOf(
//        Manifest.permission.ACCESS_FINE_LOCATION,
//        Manifest.permission.ACCESS_COARSE_LOCATION,
//        Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS
//    );
//
//    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContentView(R.layout.activity_main)
//        findViewById<Button>(R.id.btn1).setOnClickListener { //申请通知栏权限
//            ActivityCompat.requestPermissions(
//                MainActivity@ this,
//                arrayOf("android.permission.POST_NOTIFICATIONS"),
//                1
//            );
//
//        }
//        findViewById<Button>(R.id.btn2).setOnClickListener {
//            notifyt()
//        } //      revokeOwnPermissionOnKill()
//        findViewById<Button>(R.id.btn3).setOnClickListener { //申请通知栏权限
//            ActivityCompat.requestPermissions(MainActivity@ this, permissions, 1);
//        }
//        findViewById<Button>(R.id.btn4).setOnClickListener {
////            if (Build.VERSION.SDK_INT >= 33) {
////                revokeOwnPermissionsOnKill(Arrays.asList(*permissions))
////            }
//            revokeOwnPermissionOnKill("android.permission.POST_NOTIFICATIONS")
//        }
//        findViewById<Button>(R.id.btn5).setOnClickListener { //申请通知栏权限
//// Launches photo picker in single-select mode.
//// This means that the user can select one photo or video.
//            val intent = Intent(MediaStore.ACTION_PICK_IMAGES)
//            startActivityForResult(intent, 0)
//        }
//
//        findViewById<Button>(R.id.btn6).setOnClickListener {
//// Launches photo picker in single-select mode.
//// This means that the user can select one photo or video.
//            //  系统最多可选取张数
//            val maxNumPhotosAndVideos = MediaStore.getPickImagesMaxLimit()
//            val intent = Intent(MediaStore.ACTION_PICK_IMAGES)
//            //intent.type = "video/*"  //可以设置“仅显示照片”或“仅显示视频”
//            intent.putExtra(MediaStore.EXTRA_PICK_IMAGES_MAX, maxNumPhotosAndVideos)
//            startActivityForResult(intent, 1)
//        }
//    }
//
//    /**
//     * 发送通知
//     */
//    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
//    fun notifyt() {
//        var manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//        var id = "channel_1"; //自定义设置通道ID属性
//        var description = "123"; //自定义设置通道描述属性
//        var importance = NotificationManager.IMPORTANCE_HIGH; //通知栏管理重要提示消息声音设定
//        val mChannel = NotificationChannel(id, "123", importance) //建立通知栏通道类（需要有ID，重要属性）
//        manager.createNotificationChannel(mChannel); ////最后在notificationmanager中创建该通知渠道
//        var notification = Notification.Builder(this, id) //创建Notification对象。
//            .setContentTitle("付款通知")  //设置通知标题
//            .setSmallIcon(R.mipmap.ceb_logo) //设置通知小图标
//            .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ceb_logo)) //设置通知大图标
//            .setContentText("您已付款元") //设置通知内容
//            .setAutoCancel(true) //设置自动删除通知
//            .build(); //运行
//
//        manager.notify(1000, notification); //通知栏保留多条通知
//    }
//    // onActivityResult() handles callbacks from the photo picker.
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (resultCode != Activity.RESULT_OK) {
//            // Handle error
//            return
//        }
//        when (requestCode) {
//            0 -> {
//                // Get photo picker response for single select.
//                val currentUri: Uri = data!!.data!!
//
//                // Do stuff with the photo/video URI.
//                return
//            }
//            1 -> {
//                // Get photo picker response for multi select.
//                var i = 0
//                while (i < data!!.clipData!!.itemCount) {
//
//                }
//            }
//        }
//    }
//
//}
