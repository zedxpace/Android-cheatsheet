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

//seekbar - to track music progress
SeekBar progress = findViewById(R.id.music_bar);

//set the max of seekbar equal to the max duration of mp3
progress.setMax(player.getDuration());

//to update the seekbar as soon ass song proceeds ,update the seekbar after every 100 milli seconds period with delay as 0
new Timer().scheduleAtFixedRate(new TimerTask() {
    @Override
    public void run() {
        progress.setProgress(player.getCurrentPosition());
    }
} ,0 ,900);

progress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        player.seekTo(progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});
