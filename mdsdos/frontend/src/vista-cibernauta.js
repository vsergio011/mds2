import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

class VistaCibernauta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width : 100%;
                }
            </style>
<vaadin-vertical-layout style="justify-content: center; height: 100%; width: 100%; flex-direction: column;" id="vaadinVerticalLayout"></vaadin-vertical-layout>
`;
        
    }

    static get is() {
        return 'vista-cibernauta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCibernauta.is, VistaCibernauta);
