FROM docker:stable

# install git, bash, kind, kubectl and clone the kubernetes-client/gen code base
RUN apk add --no-cache git bash && \
    wget -O /usr/bin/kind https://kind.sigs.k8s.io/dl/v0.17.0/kind-linux-amd64 && \
    chmod +x /usr/bin/kind && \
    wget -O /usr/bin/kubectl https://dl.k8s.io/release/v1.28.2/bin/linux/amd64/kubectl && \
    chmod +x /usr/bin/kubectl && \
    git clone https://github.com/kubernetes-client/gen.git && \
    cd gen && \
    git checkout 84f2bc9e34129f92606a00fccb8c5c62204012b9


COPY generate.sh generate.sh

RUN chmod +x generate.sh

WORKDIR gen/openapi

CMD ["/generate.sh"]