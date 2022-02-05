VideoView video = findViewById(R.id.vid_view);

//setVideoPath : helps to attaches an android resource to the view
//getPackageName : returns the package name
//it will only take the video from res and play it
//replace video_name with the video which you added into you resources directory
video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_name);

//Play-Pause-forward-rewind video
/*
 * MediaController Object : returns the controller object ,without following code
 * we can not pause forward etc video.
 * setMediaController : bind videoView object with the controller object
 * setAnchorView : set the controller to the video to state that controller will control which video
 */
MediaController controller = new MediaController(this);
video.setMediaController(controller);
//video is the object created in above snipet
controller.setAnchorView(video);
