multibranchPipelineJob('configuration-as-code') {
          branchSources {
              git {
                  id = 'configuration-as-code'
                  remote('https://github.com/tinytelly/flux-get-started.git')
              }
          }
      }
