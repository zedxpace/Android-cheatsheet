VideoView video = findViewById(R.id.vid_view);

//setVideoPath : helps to attaches an android resource to the view
//getPackageName : returns the package name
//it will only take the video from res and play it
//replace video_name with the video which you added into you resources directory
video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_name);
