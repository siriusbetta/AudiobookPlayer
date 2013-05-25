<doctype html!>
			<head>
			<title>asd</title>
            <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>

            <script type="text/javascript">

                jQuery(function($) {
                    var supportsAudio = !!document.createElement('audio').canPlayType;
                    if(supportsAudio) {
                        var index = 0,
                        playing = false;
                        mediaPath = 'audio/',
                        extension = '',
                        tracks = [
                            {"track":1,"name":"Happy Birthday Variation: In the style of Beethoven","length":"00:55","file":"Linda1.mp3"},
                            {"track":2,"name":"Wedding March Variation 1","length":"00:37","file":"02_Wedding_March_1"},
                            {"track":3,"name":"Happy Birthday Variation: In the style of Tango","length":"01:05","file":"Linda2.mp3"},
                            {"track":4,"name":"Wedding March Variation 2","length":"00:40","file":"04_Wedding_March_2"},
                            {"track":5,"name":"Random Classical","length":"00:59","file":"05_AFI_com"}
                        ],
                        trackCount = tracks.length,
                        npAction = $('#npAction'),
                        npTitle = $('#npTitle'),
                        audio = $('#audio1').bind('play', function() {
                            playing = true;
                            npAction.text('Now Playing:');
                        }).bind('pause', function() {
                            playing = false;
                            npAction.text('Paused:');
                        }).bind('ended', function() {
                            npAction.text('Paused:');
                            if((index + 1) < trackCount) {
                                index++;
                                loadTrack(index);
                                audio.play();
                            } else {
                                audio.pause();
                                index = 0;
                                loadTrack(index);
                            }
                        }).get(0),
                        btnPrev = $('#btnPrev').click(function() {
                            if((index - 1) > -1) {
                                index--;
                                loadTrack(index);
                                if(playing) {
                                    audio.play();
                                }
                            } else {
                                audio.pause();
                                index = 0;
                                loadTrack(index);
                            }
                        }),
                        btnNext = $('#btnNext').click(function() {
                            if((index + 1) < trackCount) {
                                index++;
                                loadTrack(index);
                                if(playing) {
                                    audio.play();
                                }
                            } else {
                                audio.pause();
                                index = 0;
                                loadTrack(index);
                            }
                        }),
                        li = $('#plUL li').click(function() {
                            var id = parseInt($(this).index());
                            if(id !== index) {
                                playTrack(id);
                            }
                        }),
                        loadTrack = function(id) {
                            $('.plSel').removeClass('plSel');
                            $('#plUL li:eq(' + id + ')').addClass('plSel');
                            npTitle.text(tracks[id].name);
                            index = id;
                            audio.src = mediaPath + tracks[id].file + extension;
                        },
                        playTrack = function(id) {
                            loadTrack(id);
                            audio.play();
                        };
                        if(audio.canPlayType('audio/ogg')) {
                            extension = '.ogg';
                        }
                        if(audio.canPlayType('audio/mpeg')) {
                            extension = '.mp3';
                        }
                        loadTrack(index);
                    }
                    });
                });
            </script>
		</head>
		<body>
		

    <div id="cwrap">

        <div id="nowPlay">

            <h3 id="npAction">Paused:</h3>

            <div id="npTitle"></div>

        </div>

        <div id="audiowrap">

            <div id="audio0">

                <audio id="audio1" controls="controls" width="300">

                    Your browser does not support the HTML5 Audio Tag.

                </audio>

            </div>

            <div id="extraControls">

                <button id="btnPrev" class="ctrlbtn">|&lt;&lt; Prev Track</button> <button id="btnNext" class="ctrlbtn">Next Track &gt;&gt;|</button>

            </div>

        </div>

        <div id="plwrap">

            <div class="plHead">

                <div class="plHeadNum">Track</div>

                <div class="plHeadTitle">Title</div>

                <div class="plHeadLength">Length</div>

            </div>

            <ul id="plUL">

                <li>

                    <div class="plItem">

                        <div class="plNum">1</div>

                        <div class="plTitle">Happy Birthday Variation: In the style of Beethoven</div>

                        <div class="plLength">0:55</div>

                    </div>

                </li>

                <li>

                    <div class="plItem">

                        <div class="plNum">2</div>

                        <div class="plTitle">Wedding March Variation 1</div>

                        <div class="plLength">0:37</div>

                    </div>

                </li>

                <li>

                    <div class="plItem">

                        <div class="plNum">3</div>

                        <div class="plTitle">Happy Birthday Variation: In the style of Tango</div>

                        <div class="plLength">1:05</div>

                    </div>

                </li>

                <li>

                    <div class="plItem">

                        <div class="plNum">4</div>

                        <div class="plTitle">Wedding March Variation 2</div>

                        <div class="plLength">0:40</div>

                    </div>

                </li>

                <li>

                    <div class="plItem">

                        <div class="plNum">5</div>

                        <div class="plTitle">Random Classical</div>

                        <div class="plLength">0:59</div>

                    </div>

                </li>

            </ul>

        </div>

    </div>


        </body>

    </html>