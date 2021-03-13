import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-cabecerapagina.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="vaadinVerticalLayout"></vaadin-vertical-layout>
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
