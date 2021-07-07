import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

class VistaNotificacion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <label id="msgLbl" style="width: 40%;"></label>
 <label id="asuntoLbl" style="width: 25%;"></label>
 <label id="fechaLbl" style="width: 25%;"></label>
 <vaadin-checkbox id="vaadinCheckbox" style="width: 10%;"></vaadin-checkbox>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-notificacion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaNotificacion.is, VistaNotificacion);
