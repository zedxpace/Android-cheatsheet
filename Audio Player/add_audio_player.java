//Creating an object of media player
MediaPlayer player;

//create 3 buttons play ,pause ,stop and set their onclick to below functions play() ,pause() ,stop()
//play music
public void play(View view){
    player.start();
}

//paus music
public void pause(View view){
    player.pause();
}

//stop music
public void stop(View view){
    player.stop();
}

//binding mp3 in resource to the media player object
//replace music with the name of mp3 which you wanna embbed
player = MediaPlayer.create(this ,R.raw.music);
