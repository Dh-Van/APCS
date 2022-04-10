FROM gitpod/workspace-full
FROM gitpod/workspace-full-vnc

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && sdk install java 8.0.292-open"