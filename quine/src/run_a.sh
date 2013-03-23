while true; do clear; ruby a.rb | tee b.rb; sleep 1; mv -f b.rb a.rb; done
